package Tema9;
public class Tiempo {
private int hr;
private int seg;
private int min;
public Tiempo(int hr, int min, int seg) {
this.hr = hr;
this.min = min;
this.seg = seg;
}
public String toString() {
	return this.hr + "hr" + " " + this.min + "m" + " " + this.seg + "s";
}
public void suma(Tiempo t) {
	this.hr += t.hr;
	this.min += t.min;
	this.seg += t.seg;
	if (this.seg >= 60) {
		for (this.seg = this.seg; this.seg >= 60; this.seg -= 60) {
			this.min += 1;
		}
	}
	if (this.min >= 60) {
		for (this.min = this.min; this.min >= 60; this.min -= 60) {
			this.hr += 1;
		}
	}
}
}
