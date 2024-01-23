package servis;

import model.challeng.Challeng;
import model.challeng.ThirdChalleng;
import model.exception.WrongChallengExceotion;
import model.exception.WrongLevelException;
import model.level.Easy;
import model.level.Level;
import servis.user.User;

public class PlayStaytion {
    public void startGame(Level level, Challeng challeng, User user) throws WrongChallengExceotion {
        challeng.action();
        level.perform();
        user.getChallengList();


        if (!user.getChallengList().contains(ThirdChalleng.INSTANCE)) {
            if (user.getChallengList().stream().noneMatch(i -> i == challeng)) {
                throw new WrongChallengExceotion("khataye marhale");
            }
            if (challeng == ThirdChalleng.INSTANCE && level instanceof Easy) {
                throw new WrongLevelException();
            }


        }
    }
}