# HelloWorldアプリに必要なクラス、メソッド

## 文字入力  
基本も基本だが、少しハマってる感あり  
`text = findViewById(R.id.AddTextView);`  
`text.append("あ");`  
 今回は、文字を一文字ずつ追加する仕様としたので、append()を使用した。  
 **※append()を使えるクラス（オブジェクト）探しに時間が結構かかった。**

## イベント処理  
1. onClick属性でクリックイベントを処理する  
  <Button>タグのandroid:onclick属性を使い、  
 Activity.javaにて、定義したメソッドを追加することで  
 クリックイベントを追加出来ました。  
2. OnClickListenerでクリックイベントを処理する  
 Activity.javaでView.OnClickListenerを使用することで、  
 ボタンに対してクリックイベントリスナーを登録することができます。  
 最初はこちら側で実装しましたが、１の方がシンプルになりました。

## log関連  
logcatの基本通りに実装

## リソース関連   
文字列をボタンなどに設定するとワーニングが発生。  
そのワーニングの解決方法として、  
values/strings.xmlに文字列を定義しなければならなかった。
