jettyとjersey2を使ったJAX-RSのexample
======================================

mavenのjettyプラグインを使用して、JAX-RS(jersey2)を使用したWebサービスを作成するサンプル。


- Jetty上でJAX-RSを使用する。
- JAX-RSの実装はjersey2を使用する。

jerseyで、javax.json.JsonObject([Json Processing](http://docs.oracle.com/javaee/7/tutorial/doc/jsonp.htm)) を使用するために、jersey-media-json-processingを使用する。

jerseyで、Pojo→Jso、Json→Pojoへの変換をサポートするために、jesey-media-json-jacksonを使用する。

web.xmlは使用しなくてもよい。javax.ws.rs.core.ApplicationのサブクラスApplicationConfigクラスでApplicationPathアノテーションを使用してJAX-RSのリソースを登録している。


