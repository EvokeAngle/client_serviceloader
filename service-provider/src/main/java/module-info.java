import disneyworld.implementation.Donald;
import disneyworld.implementation.Goofy;
import disneyworld.implementation.Mickey;
import disneyworld.service.DisneyWorldMember;

module serviceimplementations {
	requires serviceinterface;

	provides DisneyWorldMember with Mickey, Donald, Goofy;
}