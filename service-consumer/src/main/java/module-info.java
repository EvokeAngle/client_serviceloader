
module serviceconsumer {
	requires serviceinterface;
    requires javafx.graphics;
    requires javafx.controls;

    uses disneyworld.service.DisneyWorldMember;


    exports serviceconsumer;

}