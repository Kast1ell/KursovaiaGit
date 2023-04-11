module module {
    requires static lombok;
    requires java.naming;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires hibernate.core;
    requires hibernate.jpa;

    requires java.sql;
    requires com.microsoft.sqlserver.jdbc;



    exports com.marketing.DataBase.pojoes;
    opens com.marketing.DataBase.pojoes to hibernate.core;


    exports com.marketing to javafx.graphics;
    opens com.marketing to javafx.fxml;

}
