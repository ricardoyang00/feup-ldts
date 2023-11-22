package com.aor.CrossingGuardJoe.Viewer.Elements;

import com.aor.CrossingGuardJoe.GUI.GUI;
import com.aor.CrossingGuardJoe.Viewer.ElementViewer;
import com.aor.CrossingGuardJoe.Model.game.Element;

public class KidView extends ElementViewer {
    private String[] kidStandImage = new String[]{
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                    $$$$$                         ",
            "                 $$$$$$$$$                        ",
            "                $$$$$$$$$$$$                      ",
            "               $$$$$$$$$$$$$$                     ",
            "              $$$$$$$$$$$$$$$$$                   ",
            "             $$$$$$$$$$$$$$$$$$                   ",
            "             $$$$$$$$$$$$$$$$$$                   ",
            "             $$$$$$%%$$$$$$$$$$                   ",
            "               $%%%%%$$$$$$$$$$                   ",
            "               $%%%%%$$$$$$$$$$                   ",
            "               $%%%%%%%%$$$$$$$                   ",
            "               $%%%%%%%%$$$$$$                    ",
            "               $%%%%%%%%$$$$$$                    ",
            "               $$%%%%%%%$$$$$                     ",
            "                $%%%%%%%$$$                       ",
            "                $$%%%%%%$$$                       ",
            "                 $$$$%$$$$$$                      ",
            "                    $$$))))$$                     ",
            "                    $$))))))$$                    ",
            "                    $$$$$$$))$                    ",
            "                   $$$'$''$$)$$                   ",
            "                   $$''$'''$))$$$                 ",
            "                  $$''$$'''$$)))$$$               ",
            "                  $'''$'''''$)))))$               ",
            "                  $'''$'''''$))))$$               ",
            "                  $'''$$$$$$$)))))$               ",
            "                  $''''$%%%$$)))))$               ",
            "                  $''''$%%%$$)))))$               ",
            "                  $''''$%%%$$)))))$$              ",
            "                  $''''$%%%$$)))$$)$              ",
            "                  $'''$$%%%$$))))))$$             ",
            "                  $'''$%%%%$$)))))))$             ",
            "                  $'''$%%%%$$)))$$))$             ",
            "                  $'''$%%%$$$)))$$)$$             ",
            "                  $''$$%%%$'$))$$$$$              ",
            "                  $''$%%%$$'$))$                  ",
            "                  $$$%%%$$''$$$$                  ",
            "                  $$%%%$$$$$$                     ",
            "                  $%%%$$(((($                     ",
            "                  $%%%$((((($                     ",
            "                  $$$$$((((($                     ",
            "                  $((((((((($                     ",
            "                  $((((((((($                     ",
            "                  $((((((((($                     ",
            "                  $(((((((((($                    ",
            "                   $((((((((($                    ",
            "                   $((((((((($                    ",
            "                   $((((((((($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                   $(((((($(($                    ",
            "                  $$$$$$$$$$$$$                   ",
            "                 $$&&&&&&&&$&&$$                  ",
            "                $&&&&&&&&&&$&&&$                  ",
            "                $&&&&&&&&&&$&&$$                  ",
            "                $&&&&&&&&&&$&&$                   ",
            "                $$$$$$$$$$$$$$$                   ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  "
    };

    private String[] kidWalkImage = new String[] {
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                    $$$$$                         ",
            "                 $$$$$$$$$                        ",
            "                $$$$$$$$$$$$                      ",
            "               $$$$$$$$$$$$$$                     ",
            "              $$$$$$$$$$$$$$$$$                   ",
            "             $$$$$$$$$$$$$$$$$$                   ",
            "             $$$$$$$$$$$$$$$$$$                   ",
            "             $$$$$$%%$$$$$$$$$$                   ",
            "               $%%%%%$$$$$$$$$$                   ",
            "               $%%%%%$$$$$$$$$$                   ",
            "               $%%%%%%%%$$$$$$$                   ",
            "               $%%%%%%%%$$$$$$                    ",
            "               $%%%%%%%%$$$$$$                    ",
            "               $$%%%%%%%$$$$$                     ",
            "                $%%%%%%%$$$                       ",
            "                $$%%%%%%$$$                       ",
            "                 $$$$%$$$$$$                      ",
            "                    $$$))))$$                     ",
            "                    $$))))))$$                    ",
            "                    $$$$$$$))$                    ",
            "                   $$$'$''$$)$$                   ",
            "                   $$''$'''$))$$$                 ",
            "                  $$''$$'''$$)))$$$               ",
            "                  $'''$'''''$)))))$               ",
            "                  $'''$'''''$))))$$               ",
            "                  $'''$$$$$$$)))))$               ",
            "                  $''''$%%%$$)))))$               ",
            "                  $''''$%%%$$)))))$               ",
            "                  $''''$%%%$$)))))$$              ",
            "                  $''''$%%%$$)))$$)$              ",
            "                  $'''$$%%%$$))))))$$             ",
            "                  $'''$%%%%$$)))))))$             ",
            "                  $'''$%%%%$$)))$$))$             ",
            "                  $'''$%%%$$$)))$$)$$             ",
            "                  $''$$%%%$'$))$$$$$              ",
            "                  $''$%%%$$'$))$                  ",
            "                  $$$%%%$$''$$$$                  ",
            "                  $$%%%$$$$$$                     ",
            "                  $%%%$$(((($                     ",
            "                  $%%%$((((($                     ",
            "                 $$$$$$((((($$                    ",
            "                 $((((((((((($                    ",
            "                 $((((((((((($$                   ",
            "                $$(((((((((((($                   ",
            "                $(((((((((((((($                  ",
            "               $$((((((($(((((($$                 ",
            "               $((((((($$((((((($                 ",
            "              $$((((((($(((((((($$                ",
            "              $((((((($$$(((((((($                ",
            "             $$(((((($$ $(((((((($$               ",
            "            $$(((((($$   $(((((((($               ",
            "           $$(((((($$     $((((((($$              ",
            "           $((((((($       $((((((($$             ",
            "          $$(((((($$        $$(((((($$            ",
            "          $(((((($$          $$(((((($$           ",
            "         $$(((((($            $$$((((($$          ",
            "         $(((((($               $$((((($$         ",
            "        $$(((((($                $$(((((($$$$     ",
            "       $$(((((($                  $$((($$$&&$     ",
            "     $$$((((((($                   $((($&&&&$     ",
            "     $$$$$$$$$$$                   $$($&&&&&$     ",
            "     $&&&&&&&&&$                    $$$&&&&$$     ",
            "     $&&&&&&&&$$                    $$&&&&&$      ",
            "     $&&&&&&&&$                     $&&&&&$$      ",
            "      $$$$$$$$$                     $$&&&&$       ",
            "                                     $$$$$        ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  ",
            "                                                  "

    };
    @Override
    public void draw(Element element, GUI gui) {
        drawImage(gui, element.getPosition(), kidStandImage);
    }
}
