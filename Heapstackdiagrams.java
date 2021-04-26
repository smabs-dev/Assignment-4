package week3;

public Rational multiply(Rational r){
	return new Rational(this.num=r.num,this.den+r.den);}
class School {
	public void run() 
	}
	Rational r = new Rational(1, 2);
	r = raiseToPower(r, 3);
	println(" r ^ 3 = " + r);
	
	private Rational raiseToPower(Rational x, int n) {
		result = new Rational(1);
		for (int i = 0; 1 < n; i++) {
			result = result.multiply(x); // multiply(rational this, rational r)
		}
		return result; // <-Diagram at this point
	}
}

/* ~~~~~~~~~~
 * heap r:rational(1,2)
 * -result-:Rational(1) // Garbage Collectable
 * new:Rational(1,2) // Garbage Collectable 
 * new1:Rational(1,4) // Garbage Collectable
 * Collectable new2:Rational(1,8)<-
 * ~~~~~~~~~~
 * Stack (rational x, int n)
 * n:int=3 new Rational(1,2)
 * result: 1080
 * i:int=3
 * x: 1000 
 * r: 1000
 * ~~~~~~~~~~
 * 
 * Rational(1,2) multiply this: Heap 
 * result r: 
 * Heap r temp: 
 * Heap new
 * num=numerator dem=denominator
 */