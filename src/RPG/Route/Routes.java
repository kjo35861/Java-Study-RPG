package RPG.Route;

import RPG.View.*;
import lombok.Getter;


public enum Routes {
    CREATECHARACTER(new CreateCharacterView()), MAIN(new MainView()), BATTLE(new BattleView()),
    INFO(new InfoView()), RESULT(new ResultView()),
    ;

    @Getter
    private View view;

    Routes(View view) {
        this.view = view;
    }
}
