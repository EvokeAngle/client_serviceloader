
module serviceconsumer {
	requires serviceinterface;
    requires javafx.graphics;
    requires javafx.controls;
    requires fastjson;
    requires java.sql;
    opens bean;

    uses disneyworld.service.DisneyWorldMember;



    exports serviceconsumer;

}