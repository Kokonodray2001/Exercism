import java.lang.reflect.Array;

class ResistorColor {

    String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    ResistorColor() {

    }

    int colorCode(String color) {
        int resistance  = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(color)) {
                resistance = i;
                break;
            }
        }
        return resistance;
    }

    String[] colors() {
        return colors;
    }
}
