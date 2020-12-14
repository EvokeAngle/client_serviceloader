import disneyworld.service.DisneyWorldMember;

module serviceconsumer {
	requires serviceinterface;
    requires javafx.graphics;
    requires javafx.controls;
    requires fastjson;
    requires java.sql;
    opens bean;

    uses DisneyWorldMember;


    exports serviceconsumer;

}