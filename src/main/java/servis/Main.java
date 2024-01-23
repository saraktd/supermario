package servis;

import model.challeng.Challeng;
import model.challeng.FirstChalleng;
import model.challeng.SecundChalleng;
import model.challeng.ThirdChalleng;
import model.exception.WrongChallengExceotion;
import model.level.Easy;
import model.level.Hard;
import model.level.Level;
import model.level.Medium;
import servis.user.User;

import java.util.Random;

public class Main {


    public static void main(String[] args) throws WrongChallengExceotion {

        Challeng challeng = new Challeng() {
            @Override
            public void action() {

            }

            PlayStaytionHelper playStaytionHelper = new PlayStaytionHelper();

            final Level level = new Level() {
                @Override
                public void perform() {

                }

                final User user = new User();
            };
        };
        PlayStaytion playStaytion = new PlayStaytion();
        playStaytion.startGame(new Easy(), new FirstChalleng(), new User());
        playStaytion.startGame(new Medium(), new SecundChalleng(), new User());
        playStaytion.startGame(new Hard(), new ThirdChalleng(), new User());
        PlayStaytionHelper.randomChalleng();
        PlayStaytionHelper.randomLevel();


    }

}
