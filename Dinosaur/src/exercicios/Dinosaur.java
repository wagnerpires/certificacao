package exercicios;

public class Dinosaur {
    /*
    10. Given the following class structures, which lines can be inserted into the blank independently that would allow the class to compile? (Choose two.)

    public class Dinosaur {
      class Pterodactyl extends Dinosaur {
      }

      public void roar() {
       var dino = new Dinosaur();
       ___________________;
      }
    }

    A. dino.Pterodactyl()              B. Dinosaur.new Pterodactyl()     C. dino.new Pterodactyl()
    D. new Dino().new Pterodactyl()    E. new Dinosaur().Pterodactyl()   F. new Dinosaur.Pterodactyl()
    */

    class Pterodactyl extends Dinosaur {

    }

    public void roar() {
        var dino = new Dinosaur();

        dino.Pterodactyl();
        // A. Options A INCORRECT because the new keyword before Pterodactyl is required to create an instance
        // of the member inner class Pterodactyl using a member of the outer class Dinosaur.

        Dinosaur.new Pterodactyl();
        // B. Option B is INCORRECT, as this is not a valid way to instantiate a member inner class.

        dino.new Pterodactyl();
        // C. Option C is CORRECT and relies on the dino instance variable for the outer class instance.

        new Dino().new Pterodactyl();
        // D. Option D would be correct if Dino was changed to the correct class name, Dinosaur.

        new Dinosaur().Pterodactyl();
        // E. Options E INCORRECT because the new keyword before Pterodactyl is required to create an instance of
        // the member inner class Pterodactyl using a member of the outer class Dinosaur.

        new Dinosaur.Pterodactyl();
        // F. Finally, option F is CORRECT and relies on the fact that roar() is an instance method, which means
        // there's an implicit instance of the outer class Dinosaur available. The Dinosaur. prefix is optional, though.
    }
}