package org.wcci.apimastery;

import org.aspectj.weaver.ast.And;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.Entity.Album;
import org.wcci.apimastery.Entity.Artist;
import org.wcci.apimastery.Entity.Comment;
import org.wcci.apimastery.Entity.Song;
import org.wcci.apimastery.Service.AlbumRepository;
import org.wcci.apimastery.Service.ArtistRepository;
import org.wcci.apimastery.Service.SongRepository;

@Component
public class Populator implements CommandLineRunner {
    private AlbumRepository albumRepository;
    private SongRepository songRepository;
    private ArtistRepository artistRepository;

    public Populator(AlbumRepository albumRepository, SongRepository songRepository, ArtistRepository artistRepository) {
        this.albumRepository = albumRepository;
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Albums ----------------//
        // Albums ----------------//
        // Albums ----------------//
        Album NineteenEightyNine  = new Album ("1989","https://images.eil.com/large_image/TAYLOR_SWIFT_1989%2B%28NINETEEN%2BEIGHTY%2BNINE%29-690670.jpg", "Big Machine Records", 2);
        Album EmergencyTsunami = new Album("Emergency Tsunami", "https://cdn.vox-cdn.com/thumbor/7DfkgYcfZsT1i6j1zH63l6abLWs=/1400x1400/filters:format(png)/cdn.vox-cdn.com/uploads/chorus_asset/file/22015230/60762fc5e9194b7b624638a8b92f89bb.1000x1000x1.png", "XO and Republic Records", 4);
        Album AndJusticeForAll = new Album("...And Justice For All", " /src/images/metallica.jpg", "Elektra Records", 4);
        Album igor = new Album("Igor", "/src/images/Igor.jpg", "Columbia Records" , 3);



        AndJusticeForAll.addComment(new Comment("Awesome Album!", "Branden Webb"));
        EmergencyTsunami.addComment(new Comment("I love this Album!", "Bishnu"));
        igor.addComment(new Comment("I don't like this Album!", "Fathi"));
        AndJusticeForAll.addComment(new Comment("Very chill and relax sound!", "Miguel"));
        albumRepository.save(EmergencyTsunami);
        albumRepository.save(NineteenEightyNine);
        albumRepository.save(igor);
        albumRepository.save(AndJusticeForAll);


        // Artists ----------------//
        // Artists ----------------//
        // Artists ----------------//
        Artist Metallica = new Artist("Metallica");
        Metallica.addAlbum(AndJusticeForAll);
        Artist Nav = new Artist("Nav");
        Nav.addAlbum(EmergencyTsunami);
        Artist TylerSwift = new Artist("Tyler Swift");
        TylerSwift.addAlbum(NineteenEightyNine);
        Artist tylerTheCreator = new Artist("Tyler, The Creator");
        tylerTheCreator.addAlbum(igor);
        artistRepository.save(Metallica);
        artistRepository.save(TylerSwift);
        artistRepository.save(Nav);
        artistRepository.save(tylerTheCreator);

        // Songs ----------------//
        // Songs ----------------//
        // Songs ----------------//
        Song YoungWheezy = new Song("Young Wheezy", "young wheezy young wheezy", EmergencyTsunami, 5, "2:33");
        Song Repercussions = new Song("Repercussions", "young wheezy young wheezy", EmergencyTsunami, 3, "2:39");
        Song VetementSocks = new Song("Vetement Socks", "young wheezy young wheezy", EmergencyTsunami, 3, "2:35");
        Song blackened = new Song("Blackened", "sample", AndJusticeForAll, 4, "6:42");
        Song andJusticeForAll = new Song("...And Justice For All", "sample", AndJusticeForAll, 3, "9:46");
        Song eyeOfTheBeholder = new Song("Eye of the Beholder", "sample", AndJusticeForAll, 4 , "6:26");
        Song one = new Song("One", "sample", AndJusticeForAll, 5, "7:26");
        Song theShortestStraw = new Song("The Shortest Straw", "sample", AndJusticeForAll, 3, "6:35");
        Song harvesterOfSorrow = new Song("Harvester of Sorrow", "sample", AndJusticeForAll, 3, "5:45");
        Song frayedEnds = new Song("The Frayed Ends of Sanity", "sample", AndJusticeForAll, 4, "7:43");
        Song toLiveIsToDie = new Song("To Live Is to Die", "sample", AndJusticeForAll, 4, "9:48");
        Song dyersEve = new Song("Dyers Eve", "sample", AndJusticeForAll, 5, "5:13");
        Song WelcomeToNewYork = new Song("Welcome To New York", "sample",NineteenEightyNine, 2,"3:32" );
        Song BlankSpace = new Song("Blank Space", "sample", NineteenEightyNine, 3, "3:51");
        Song Style = new Song("Style", "sample", NineteenEightyNine, 5, "3:51");
        Song OutOfTheWoods = new Song("Out Of The Woods", "sample", NineteenEightyNine, 4, "3:55");
        Song AllYouHadToDoWasStay = new Song("All You Had To Do Was Stay", "sample", NineteenEightyNine, 5, "3:13");
        Song ShakeItOff = new Song("Shake It Off", "sample", NineteenEightyNine, 4, "3:39");
        Song IWishYouWould = new Song("I Wish You Would", "sample", NineteenEightyNine, 3, "3:27");
        Song BadBlood = new Song("Bad Blood", "sample", NineteenEightyNine, 4, "3:31");
        Song WildestDreams = new Song("Wildest Dreams", "sample", NineteenEightyNine, 3, "3:40");
        Song HowYouGetTheGirl = new Song("How You Get The Girl", "sample", NineteenEightyNine, 5, "4:07");
        Song ThisLove = new Song("This Love","sample", NineteenEightyNine, 3, "4:10");
        Song IknowPlaces = new Song("I know Places", "sample", NineteenEightyNine, 2, "3:15");
        Song Clean = new Song("Clean", "sample", NineteenEightyNine, 1, "4:31");
        Song igorsTheme = new Song("Igor's Theme", "sample", igor, 3, "3:21");
        Song earfquake = new Song("Earfquake", "sample", igor, 2,"3:11");
        Song iThink = new Song("I Think", "sample", igor, 3,"3:33");
        Song runningOutOfTime = new Song("Running Out Of Time", "sample", igor, 4, "2:58");
        Song newMagicWand = new Song("New Magic Wand", "sample", igor, 3, "3:16");
        Song ABoyIsAGun = new Song("A Boy Is A Gun", "sample", igor, 3, "3:31");
        Song puppet = new Song("Puppet", "sample", igor, 4, "3:00");
        Song whatsGood = new Song("What's Good", "sample", igor, 4, "3:26");
        Song goneGoneThankYou = new Song("Gone, Gone/Thank You", "sample", igor, 2, "6:16");
        Song iDontLoveYouAnymore = new Song("I Don't Love You Anymore", "sample", igor, 3, "2:42");
        Song areWeStillFriends = new Song("Are We Still Friends", "sample", igor, 5 , "4:26");
        Metallica.addAlbum(AndJusticeForAll);
        TylerSwift.addAlbum(NineteenEightyNine);
        Nav.addAlbum(EmergencyTsunami);
        tylerTheCreator.addAlbum(igor);
        WelcomeToNewYork.addArtist(TylerSwift);
        BlankSpace.addArtist(TylerSwift);
        Style.addArtist(TylerSwift);
        OutOfTheWoods.addArtist(TylerSwift);
        AllYouHadToDoWasStay.addArtist(TylerSwift);
        ShakeItOff.addArtist(TylerSwift);
        IWishYouWould.addArtist(TylerSwift);
        BadBlood.addArtist(TylerSwift);
        WildestDreams.addArtist(TylerSwift);
        HowYouGetTheGirl.addArtist(TylerSwift);
        ThisLove.addArtist(TylerSwift);
        IknowPlaces.addArtist(TylerSwift);
        Clean.addArtist(TylerSwift);
        andJusticeForAll.addArtist(Metallica);
        blackened.addArtist(Metallica);
        eyeOfTheBeholder.addArtist(Metallica);
        one.addArtist(Metallica);
        theShortestStraw.addArtist(Metallica);
        harvesterOfSorrow.addArtist(Metallica);
        frayedEnds.addArtist(Metallica);
        toLiveIsToDie.addArtist(Metallica);
        dyersEve.addArtist(Metallica);
        igorsTheme.addArtist(tylerTheCreator);
        earfquake.addArtist(tylerTheCreator);
        iThink.addArtist(tylerTheCreator);
        runningOutOfTime.addArtist(tylerTheCreator);
        newMagicWand.addArtist(tylerTheCreator);
        ABoyIsAGun.addArtist(tylerTheCreator);
        puppet.addArtist(tylerTheCreator);
        whatsGood.addArtist(tylerTheCreator);
        goneGoneThankYou.addArtist(tylerTheCreator);
        iDontLoveYouAnymore.addArtist(tylerTheCreator);
        areWeStillFriends.addArtist(tylerTheCreator);
        songRepository.save(YoungWheezy);
        songRepository.save(Repercussions);
        songRepository.save(VetementSocks);
        songRepository.save(blackened);
        songRepository.save(andJusticeForAll);
        songRepository.save(eyeOfTheBeholder);
        songRepository.save(one);
        songRepository.save(theShortestStraw);
        songRepository.save(harvesterOfSorrow);
        songRepository.save(frayedEnds);
        songRepository.save(toLiveIsToDie);
        songRepository.save(dyersEve);
        songRepository.save(igorsTheme);
        songRepository.save(earfquake);
        songRepository.save(iThink);
        songRepository.save(runningOutOfTime);
        songRepository.save(newMagicWand);
        songRepository.save(ABoyIsAGun);
        songRepository.save(puppet);
        songRepository.save(whatsGood);
        songRepository.save(goneGoneThankYou);
        songRepository.save(iDontLoveYouAnymore);
        songRepository.save(areWeStillFriends);
        songRepository.save(WelcomeToNewYork);
        songRepository.save(BlankSpace);
        songRepository.save(Style);
        songRepository.save(OutOfTheWoods);
        songRepository.save(AllYouHadToDoWasStay);
        songRepository.save(ShakeItOff);
        songRepository.save(IWishYouWould);
        songRepository.save(BadBlood);
        songRepository.save(WildestDreams);
        songRepository.save(HowYouGetTheGirl);
        songRepository.save(ThisLove);
        songRepository.save(IknowPlaces);
        songRepository.save(Clean);
    }

}
