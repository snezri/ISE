package scene;

import elements.AmbientLight;
import Geometries.Geometries;
import Primitives.Color;

public class Scene {
    private final String _name;

    //according to Dan Zilberstein directives
    public Color background = Color.BLACK;
    public AmbientLight ambientlight= new AmbientLight(new Color(192, 192, 192),1.d); ;
    public Geometries geometries = null;

    public Scene(String name) {
        _name = name;
        geometries= new Geometries();
    }

    //chaining set methods (this NOT a builder pattern)

    public Scene setBackground(Color background) {
        this.background = background;
        return  this;
    }

    public Scene setAmbientLight(AmbientLight ambientlight) {
        this.ambientlight = ambientlight;
        return this;
    }

    public Scene setGeometries(Geometries geometries) {
        this.geometries = geometries;
        return  this;
    }

}