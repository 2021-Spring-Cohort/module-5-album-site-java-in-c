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

        Album album1 = new Album("...And Justice For All", "/src/images/metallica.jpg");
        Song blackened = new Song("Blackened", "sample", album1);
        Artist artist1 = new Artist("Metallica");
        Song andJusticeForAll = new Song("...And Justice For All", "sample", album1);
        Song eyeOfTheBeholder = new Song("Eye of the Beholder", "sample", album1);
        Song one = new Song("One", "sample", album1);
        Song theShortestStraw = new Song("The Shortest Straw", "sample", album1);
        Song harvesterOfSorrow = new Song("Harvester of Sorrow", "sample", album1);
        Song frayedEnds = new Song("The Frayed Ends of Sanity", "sample", album1);
        Song toLiveIsToDie = new Song("To Live Is to Die", "sample", album1);
        Song dyersEve = new Song("Dyers Eve", "sample", album1);

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

        albumRepository.save(album1);
        artist1.addAlbum(album1);
        artistRepository.save(artist1);

        andJusticeForAll.addArtist(artist1);
        blackened.addArtist(artist1);
        eyeOfTheBeholder.addArtist(artist1);
        one.addArtist(artist1);
        theShortestStraw.addArtist(artist1);
        harvesterOfSorrow.addArtist(artist1);
        frayedEnds.addArtist(artist1);
        toLiveIsToDie.addArtist(artist1);
        dyersEve.addArtist(artist1);

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
