package com.ysd.classes;

/*
    abstract feature
        - 関連しているクラス間のソースコードを共有したい
        - 多い数のメソッドや変数を持ち、オーバーライドメソッド内のソースコードを別々にする
        - non-static, non-finalの規約が付けられる。->変数などを共有する。

        abstract parent: animal
        child: human,cat,dog,bird,sans

    interface feature
        - 関連していないクラス間のメソッド
        - 実行するメソッドを特定したい
        - 複数のクラスを引き継ぐ際にre-usableを高めたい

        child interfaces: run
 */
public abstract class animal{

    private String pat;

    public animal(String p){
        pat = p;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public abstract void behavior();

    public String getPat() {
        return pat;
    }
}
