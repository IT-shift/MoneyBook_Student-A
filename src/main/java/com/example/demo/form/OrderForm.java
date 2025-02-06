/**
 * 下記のSpring MVCに関する問題を解いてください。
※「03_Spring MVCでの開発(フォームクラスの実装)」の講義資料を参考にしてください。
「商品注文フォーム」をテーマにしたフォームクラスを実装します。
フォームクラスの作成に関して、以下の ⓵〜⓸ にプログラムを追記し、
OrderForm.java を完成させてください。

【フォームクラスを作成する】
demo/src/main/java/com/example/demo/form 配下に以下のクラスを作成します。

フォームクラスでは、商品名と注文数量を入力として受け取ります。
各フィールドには必ず ゲッター と セッター を定義します。

OrderForm.java

package com.example.demo.form;
public class OrderForm {
private String productName;
private int quantity;
⓵(productNameのゲッター)
⓶(productNameのセッター)
⓷(quantityのゲッター)
⓸(quantityのセッター)
}
 */
package com.example.demo.form;

public class OrderForm {

    private String productName;
    private int quantity;

    public String getProductName() { // ⓵(productNameのゲッター)
    	return productName;
    }

    public void setProductName(String productName) { // ⓶(productNameのセッター)
        this.productName = productName;
    }

    public int getQuantity() { // ⓷(quantityのゲッター)
        return quantity;
    }

    public void setQuantity(int quantity) { // ⓸(quantityのセッター)
        this.quantity = quantity;
    }
}
