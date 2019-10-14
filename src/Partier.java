public interface Partier {
    void party();

    default void endParty(){
        System.out.println("Party's over, go home.");
    }
}
