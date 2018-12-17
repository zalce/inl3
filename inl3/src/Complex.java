public class Complex {

	double re, im;

	/** Skapar en komplex variabel med realdelen re och imagin�rdelen im */
	Complex(double re, double im) {

		this.re = re;
		this.im = im;
	}

	/** Tar reda p� realdelen */
	double getRe() {

		return re;
	}

	/** Tar reda p� imagin�rdelen */
	double getIm() {

		return im;

	}

	/** Tar reda p� talets absolutbelopp i kvadrat */
	double getAbs2() {

		return re * re + im * im;

	}

	/** Adderar det komplexa talet c till detta tal */
	void add(Complex c) {

		this.re = c.re + this.re;
		this.im = c.im + this.im;

	}

	/** Multiplicerar detta tal med det komplexa talet c */
	void mul(Complex c) {

		this.re = c.re * this.re;
		this.im = c.im * this.im;

	}
}