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
        Album EmergencyTsunami = new Album("Emergency Tsunami", "/src/images/metallica.jpg");
        Album AndJusticeForAll = new Album("...And Justice For All", "/src/images/metallica.jpg");
        // Artists ----------------//
        // Artists ----------------//
        // Artists ----------------//
        Artist Metallica = new Artist("Metallica");
        Artist Nav = new Artist("Nav");
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
      
       Album NinteenEightyNine  = new Album ("1989","");
        Song WelcomeToNewYork = new Song("WelcomeToNewYork", "sample",NinteenEightyNine );
        Song BlankSpace = new Song("BlankSpace", "sample", NinteenEightyNine);
        Song Style = new Song("Style", "sample", NinteenEightyNine);
        Song OutOfTheWoods = new Song("OutOfTheWoods", "sample", NinteenEightyNine);
        Song AllYouHadToDoWasStay = new Song("AllYouHadToDoWasStay", "sample", NinteenEightyNine);
        Song ShakeItOff = new Song("ShakeItOff", "sample", NinteenEightyNine);
        Song IWishYouWould = new Song("IWishYouWould", "sample", NinteenEightyNine);
        Song BadBlood = new Song("BadBlood", "sample", NinteenEightyNine);
        Song WildestDreams = new Song("WildestDreams", "sample", NinteenEightyNine);
        Song HowYouGetTheGirl = new Song("HowYouGetTheGirl", "sample", NinteenEightyNine);
        Song ThisLove = new Song("ThisLove","sample", NinteenEightyNine);
        Song IknowPlaces = new Song("IknowPlaces", "sample", NinteenEightyNine);
        Song Clean = new Song("Clean", "sample", NinteenEightyNine);

        Metallica.addAlbum(AndJusticeForAll);
        artistRepository.save(Metallica);
        Artist TylerSwift = new Artist("Tyler Swift");
        albumRepository.save(NinteenEightyNine);
        TylerSwift.addAlbum(NinteenEightyNine);
        

       

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
    }
}
