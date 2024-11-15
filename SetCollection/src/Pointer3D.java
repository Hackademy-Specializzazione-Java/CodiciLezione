public class Pointer3D {
    public int x;
    public int y;
    public int z;

    public Pointer3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

	public String print(){ 
		return "x: " + x + " y: " + y + " z: " + z; 
    }

    @Override
    public boolean equals(Object point) {
        if( point instanceof Pointer3D){
            Pointer3D p = (Pointer3D)point;
            return (x==p.x && y==p.y && z==p.z);
        } else return false;
    }

    @Override
    public int hashCode() {
        return this.x + this.y + this.z;
    }
}