package cricket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("n1")
public class National implements Player{
    private Match matchRef;
    @Autowired()
    public National(@Qualifier("match2") Match matchRef) {
        this.matchRef = matchRef;
    }

    @Override
    public void playingMatch() {
        matchRef.matchInfo();
    }

    @Override
    public void playerInfo() {
        System.out.println("REQUIRED PLAYERS ARE 11");
    }
}
