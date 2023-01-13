package basic;

public enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;   // here we declare the variable with final so need to initialize in constructor
    Direction(String direction) {   /// Constructor is very mandatory while defining Enum
          this.shortCode = direction;
    }

    public String getShortCode() {
        return shortCode;
    }
}
