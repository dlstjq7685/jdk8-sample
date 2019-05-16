package com.ysd.test;

import com.ysd.start;

import java.util.TreeMap;

public class Basic implements start {

    private TreeMap<Integer,Moneys> m;
    private TreeMap<Integer,Moneys> userm;
    private TreeMap<Integer,Moneys> resultMoney;
    private int fee;

    public Basic(){
        m = new TreeMap<>();
        userm = new TreeMap<>();
        resultMoney = new TreeMap<>();

        //支払い金額
        fee = 5730;

        m.put(10000,new Moneys(10000,0,"壱万円"));
        m.put(5000,new Moneys(5000,2,"五千円"));
        m.put(1000,new Moneys(1000,5,"千円"));
        m.put(500,new Moneys(500,50,"五百円"));
        m.put(100,new Moneys(100,23,"百円"));
        m.put(50,new Moneys(50,10,"五十円"));
        m.put(10,new Moneys(10,40,"十円"));

        userm.put(10000,new Moneys(10000,0));
        userm.put(5000,new Moneys(5000,0));
        userm.put(1000,new Moneys(1000,6));
        userm.put(500,new Moneys(500,0));
        userm.put(100,new Moneys(100,0));
        userm.put(50,new Moneys(50,0));
        userm.put(10,new Moneys(10,0));

        resultMoney.put(10000,new Moneys(10000,0));
        resultMoney.put(5000,new Moneys(5000,0));
        resultMoney.put(1000,new Moneys(1000,0));
        resultMoney.put(500,new Moneys(500,0));
        resultMoney.put(100,new Moneys(100,0));
        resultMoney.put(50,new Moneys(50,0));
        resultMoney.put(10,new Moneys(10,0));

    }

    private void combinationSearch() {
        //1.現在持っている現金を求める
        int current = sumCurrent(m,false);

        //2.お客様の現金を求める
        int userCurrent = sumCurrent(userm,false);

        //3.お客様のお釣りを計算する
        //ただし、お客様現在が足りない場合もある
        int refund = userCurrent - fee;

        //4.お釣りを支払いできるか判断する
        boolean flag = (current - refund) > 0 ? true : false;

        if(flag){

            //5.お釣りを計算する
            searchTop(refund);


            //確認
            int check = sumCurrent(resultMoney,true);
            System.out.println(check);
        }else{
            System.out.println("unavailable this machine");
            System.exit(1);
        }
    }

    private void searchTop(int reund){

        int tempFee = reund;
        for(int key: m.descendingKeySet()){
            Moneys re = m.get(key);
            if(re.getCount() == 0)
                continue;

            //１以上なら枚数を求める
            if(tempFee / re.getValue() > 0){

                //枚数
                int count = countMoney(tempFee,re);

                //お釣りの更新
                tempFee -= count * re.getValue();

                //数えた枚数をお釣りに入れる
                if(resultMoney.containsKey(re.getValue())){
                    resultMoney.get(re.getValue()).setCount(count);
                }
            }
        }
    }

    private int countMoney(int pFee, Moneys pm){

        int count = 0;

        for(int i = 0; i < pm.getCount(); i++){
            //壱枚分を引く
            pFee -= pm.getValue();

            //0以上なら1カウント
            if(pFee >= 0)
                count++;

            //元に戻す
            else
                break;
        }
        return count;
    }


    private int sumCurrent(TreeMap<Integer,Moneys> treeMap,boolean f){

        int result = 0;
        for(Moneys temp: treeMap.values()){
            result += temp.getSum();
            if(f){
                if(temp.getSum() > 0)
                    System.out.printf("%d: %d\n",temp.getValue(),temp.getCount());
            }
        }

        return result;
    }

    @Override
    public void run() {
        combinationSearch();
    }
}
