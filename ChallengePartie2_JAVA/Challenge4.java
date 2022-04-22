package ChallengePartie2_JAVA;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Challenge4 {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
}
}
