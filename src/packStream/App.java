package packStream;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<Person> pers = findByName("jj");
        pers.get();
    }

    private static Optional<Person> findByName(String name){
        if(name.equals("Name")){
            return  Optional.of(new Person());
        }else {
            return Optional.empty();
        }
    }
}
