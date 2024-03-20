package cricket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("i1")
public class International implements Player{
    private Match matchRef;
    @Autowired
    public International(@Qualifier("match1") Match matchRef) {
        this.matchRef = matchRef;
    }

    @Override
    public void playingMatch() {
        matchRef.matchInfo();
    }

    @Override
    public void playerInfo() {
        System.out.println("REQUIRED PALYER IS 11");
    }
}
