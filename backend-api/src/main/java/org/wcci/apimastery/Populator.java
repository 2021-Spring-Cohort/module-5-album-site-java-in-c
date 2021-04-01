package org.wcci.apimastery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.Entity.Album;
import org.wcci.apimastery.Entity.Artist;
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
        Album NineteenEightyNine  = new Album ("1989","");
        Album EmergencyTsunami = new Album("Emergency Tsunami", "/src/images/metallica.jpg");
        Album AndJusticeForAll = new Album("...And Justice For All", "/src/images/metallica.jpg");
        // Artists ----------------//
        // Artists ----------------//
        // Artists ----------------//
        Artist Metallica = new Artist("Metallica");
        Artist Nav = new Artist("Nav");
        Artist TylerSwift = new Artist("Tyler Swift");
        // Songs ----------------//
        // Songs ----------------//
        // Songs ----------------//
        Song YoungWheezy = new Song("Young Wheezy", "young wheezy young wheezy", EmergencyTsunami);
        Song Repercussions = new Song("Repercussions", "young wheezy young wheezy", EmergencyTsunami);
        Song VetementSocks = new Song("Vetement Socks", "young wheezy young wheezy", EmergencyTsunami);
        Song blackened = new Song("Blackened", "sample", AndJusticeForAll);
        Song andJusticeForAll = new Song("...And Justice For All", "sample", AndJusticeForAll);
        Song eyeOfTheBeholder = new Song("Eye of the Beholder", "sample", AndJusticeForAll);
        Song one = new Song("One", "sample", AndJusticeForAll);
        Song theShortestStraw = new Song("The Shortest Straw", "sample", AndJusticeForAll);
        Song harvesterOfSorrow = new Song("Harvester of Sorrow", "sample", AndJusticeForAll);
        Song frayedEnds = new Song("The Frayed Ends of Sanity", "sample", AndJusticeForAll);
        Song toLiveIsToDie = new Song("To Live Is to Die", "sample", AndJusticeForAll);
        Song dyersEve = new Song("Dyers Eve", "sample", AndJusticeForAll);
        Song WelcomeToNewYork = new Song("WelcomeToNewYork", "sample",NineteenEightyNine );
        Song BlankSpace = new Song("BlankSpace", "sample", NineteenEightyNine);
        Song Style = new Song("Style", "sample", NineteenEightyNine);
        Song OutOfTheWoods = new Song("OutOfTheWoods", "sample", NineteenEightyNine);
        Song AllYouHadToDoWasStay = new Song("AllYouHadToDoWasStay", "sample", NineteenEightyNine);
        Song ShakeItOff = new Song("ShakeItOff", "sample", NineteenEightyNine);
        Song IWishYouWould = new Song("IWishYouWould", "sample", NineteenEightyNine);
        Song BadBlood = new Song("BadBlood", "sample", NineteenEightyNine);
        Song WildestDreams = new Song("WildestDreams", "sample", NineteenEightyNine);
        Song HowYouGetTheGirl = new Song("HowYouGetTheGirl", "sample", NineteenEightyNine);
        Song ThisLove = new Song("ThisLove","sample", NineteenEightyNine);
        Song IknowPlaces = new Song("IknowPlaces", "sample", NineteenEightyNine);
        Song Clean = new Song("Clean", "sample", NineteenEightyNine);

        // adding Repos ----------------//
        // adding Repos ----------------//
        // adding Repos ----------------//
        albumRepository.save(AndJusticeForAll);
        artistRepository.save(Metallica);
        albumRepository.save(NineteenEightyNine);
        artistRepository.save(TylerSwift);


        Metallica.addAlbum(AndJusticeForAll);
        TylerSwift.addAlbum(NineteenEightyNine);

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

        songRepository.save(blackened);
        songRepository.save(andJusticeForAll);
        songRepository.save(eyeOfTheBeholder);
        songRepository.save(one);
        songRepository.save(theShortestStraw);
        songRepository.save(harvesterOfSorrow);
        songRepository.save(frayedEnds);
        songRepository.save(toLiveIsToDie);
        songRepository.save(dyersEve);
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
