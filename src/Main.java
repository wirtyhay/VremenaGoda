public class Main {

    public static void main(String[] args) {
        Season favoriteSeason = Season.ЛЕТО;
        printFavoriteSeason(favoriteSeason);

        for (Season season : Season.values()) {
            int averageTemperature = season.getAverageTemperature();
            String description = season.getDescription();
            System.out.printf("%s: средняя температура %d градусов, %s%n", season.name(), averageTemperature, description);
        }
    }

    public static void printFavoriteSeason(Season season) {
        switch (season) {
            case ВЕСНА:
                System.out.println("Я люблю весну");
                break;
            case ЛЕТО:
                System.out.println("Я люблю лето");
                break;
            case ОСЕНЬ:
                System.out.println("Я люблю осень");
                break;
            case ЗИМА:
                System.out.println("Я люблю зиму");
                break;
            default:
                System.out.println("Неизвестное время года");
        }
    }

    enum Season {
        ВЕСНА(15, "Теплое время года"),
        ЛЕТО(25, "Теплое время года, когда можно купаться в море"),
        ОСЕНЬ(10, "Прохладное время года, когда листья меняют цвет"),
        ЗИМА(-10, "Холодное время года, когда можно кататься на лыжах");

        private final int averageTemperature;
        private final String description;

        Season(int averageTemperature, String description) {
            this.averageTemperature = averageTemperature;
            this.description = description;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return description;
        }
    }
}