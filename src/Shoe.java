public class Shoe {

    private String _brand;
    private String _name;
    private String _color;
    private double _size;
    private int _startingMiles;
    private int _remainingMiles;
    private int _currentMiles;
    private int _endOfShoeMiles;

    public Shoe(String brand, String name, String color, double size, int startingMiles, int remainingMiles, int currentMiles, int endOfShoeMiles) {
        this._brand = brand;
        this._name = name;
        this._color = color;
        this._size = size;
        this._startingMiles = startingMiles;
        this._remainingMiles = remainingMiles;
        this._currentMiles = currentMiles;
        this._endOfShoeMiles = endOfShoeMiles;
    }

    public String get_brand() {
        return _brand;
    }

    public void set_brand(String _brand) {
        this._brand = _brand;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    public double get_size() {
        return _size;
    }

    public void set_size(double _size) {
        this._size = _size;
    }

    public int get_startingMiles() {
        return _startingMiles;
    }

    public void set_startingMiles(int _startingMiles) {
        this._startingMiles = _startingMiles;
    }

    public int get_remainingMiles() {
        return _remainingMiles;
    }

    public void set_remainingMiles(int _remainingMiles) {
        this._remainingMiles = _remainingMiles;
    }

    public int get_currentMiles() {
        return _currentMiles;
    }

    public void set_currentMiles(int _currentMiles) {
        this._currentMiles = _currentMiles;
    }

    public int get_endOfShoeMiles() {
        return _endOfShoeMiles;
    }

    public void set_endOfShoeMiles(int _endOfShoeMiles) {
        this._endOfShoeMiles = _endOfShoeMiles;
    }
}
