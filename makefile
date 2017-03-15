all: Draw.java
	javac Pixel.java
	javac Canvas.java
	javac Matrix.java
	javac Draw.java
	java Draw

run: Draw.java
	make && make png && echo "Saved as out.png"

clean: 
	rm *.class *.ppm *~

jpg: out.ppm
	java Draw; \
	convert out.ppm out.jpg

png: out.ppm
	java Draw; \
	convert out.ppm out.png

clean_images:
	rm *.jpg *.png
