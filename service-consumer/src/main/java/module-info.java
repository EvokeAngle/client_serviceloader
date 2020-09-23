import disneyworld.service.DisneyWorldMember;

module serviceconsumer {
	requires serviceinterface;
    requires javafx.graphics;
    requires javafx.controls;

    uses DisneyWorldMember;

    exports serviceconsumer;

}