import java.awt.Color;

public class Generator {

	Generator() {

	}

	/** Ritar en bild i f�nstret i anv�ndargr�nssnittet gui */
	public void render(MandelbrotGUI gui) {

		gui.disableInput();

		int width = gui.getWidth();
		int height = gui.getHeight();

		Complex[][] complex = this.mesh(gui.getMinimumReal(), gui.getMaximumReal(), gui.getMinimumImag(),
				gui.getMaximumImag(), width, height);
		Color[][] picture = new Color[height][width];
		int getRes = gui.getResolution();
		switch (getRes) {

		// G�r igenom hela matrisen - Very high resolution
		case 2048:

			for (int i = 0; i < width - 1; i++) {

				for (int k = 0; k < height - 1; k++) {

					// Om absolutbeloppet av Z p� platsen i,k �r st�rre �n 1 s�tt f�rg till vit
					if (complex[k][i].getAbs2() > 1) {

						picture[k][i] = Color.BLACK;
					}

					// F�rsta kvadrant - R�d
					else if (i < width / 2 && k < height / 2) {

						picture[k][i] = Color.RED;
					}

					// Andra kvadrant - Bl�
					else if (i > width / 2 && k < height / 2) {

						picture[k][i] = Color.BLUE;
					}

					// Tredje kvadrant - Gul
					else if (i < width / 2 && k > height / 2) {

						picture[k][i] = Color.YELLOW;
					}

					// Fj�rde kvadrant - Lila
					else if (i > width / 2 && k > height / 2) {

						picture[k][i] = Color.MAGENTA;
					}
				}
			}
			break;

		// Var 3dje pixel, High
		case 1024:

			for (int i = 1; i < width - 1; i += 3) {

				for (int k = 1; k < height - 1; k += 3) {

					// Om absolutbeloppet av Z p� platsen i,k �r st�rre �n 1 s�tt f�rg till vit
					if (complex[k][i].getAbs2() > 1) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.BLACK;
							}
						}
					}

					// F�rsta kvadrant - R�d
					else if (i < width / 2 && k < height / 2) {
						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.RED;
							}
						}
					}

					// Andra kvadrant - Bl�
					else if (i > width / 2 && k < height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.BLUE;
							}
						}
					}

					// Tredje kvadrant - Gul
					else if (i < width / 2 && k > height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.YELLOW;
							}
						}
					}

					// Fj�rde kvadrant - Lila
					else if (i > width / 2 && k > height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.MAGENTA;
							}
						}
					}
				}
			}
			break;

		// Var 5e pixel, Medium
		case 512:

			for (int i = 1; i < width - 1; i += 5) {

				for (int k = 1; k < height - 1; k += 5) {

					// Om absolutbeloppet av Z p� platsen i,k �r st�rre �n 1 s�tt f�rg till vit
					if (complex[k][i].getAbs2() > 1) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.BLACK;
							}
						}
					}

					// F�rsta kvadrant - R�d
					else if (i < width / 2 && k < height / 2) {
						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.RED;
							}
						}
					}

					// Andra kvadrant - Bl�
					else if (i > width / 2 && k < height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.BLUE;
							}
						}
					}

					// Tredje kvadrant - Gul
					else if (i < width / 2 && k > height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.YELLOW;
							}
						}
					}

					// Fj�rde kvadrant - Lila
					else if (i > width / 2 && k > height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.MAGENTA;
							}
						}
					}
				}
			}
			break;

		// Var 7e pixel, low
		case 256:

			for (int i = 1; i < width - 1; i += 7) {

				for (int k = 1; k < height - 1; k += 7) {

					// Om absolutbeloppet av Z p� platsen i,k �r st�rre �n 1 s�tt f�rg till vit
					if (complex[k][i].getAbs2() > 1) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.BLACK;
							}
						}
					}

					// F�rsta kvadrant - R�d
					else if (i < width / 2 && k < height / 2) {
						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.RED;
							}
						}
					}

					// Andra kvadrant - Bl�
					else if (i > width / 2 && k < height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.BLUE;
							}
						}
					}

					// Tredje kvadrant - Gul
					else if (i < width / 2 && k > height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.YELLOW;
							}
						}
					}

					// Fj�rde kvadrant - Lila
					else if (i > width / 2 && k > height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.MAGENTA;
							}
						}
					}
				}
			}
			break;

		// Var 9e pixel, Very low
		case 128:

			for (int i = 1; i < width - 1; i += 9) {

				for (int k = 1; k < height - 1; k += 9) {

					// Om absolutbeloppet av Z p� platsen i,k �r st�rre �n 1 s�tt f�rg till vit
					if (complex[k][i].getAbs2() > 1) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.BLACK;
							}
						}
					}

					// F�rsta kvadrant - R�d
					else if (i < width / 2 && k < height / 2) {
						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.RED;
							}
						}
					}

					// Andra kvadrant - Bl�
					else if (i > width / 2 && k < height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.BLUE;
							}
						}
					}

					// Tredje kvadrant - Gul
					else if (i < width / 2 && k > height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.YELLOW;
							}
						}
					}

					// Fj�rde kvadrant - Lila
					else if (i > width / 2 && k > height / 2) {

						for (int j = i - 1; j <= i + 1; j++) {

							for (int l = k - 1; l <= k + 1; l++) {
								picture[l][j] = Color.MAGENTA;
							}
						}
					}
				}
			}
			break;
		}

		gui.putData(picture, 1, 1);
		gui.enableInput();
	}

	/**
	 * Skapar en matris d�r varje element �r ett komplext tal som har r�tt
	 * koordinater (se beskrivning nedan)
	 */
	private Complex[][] mesh(double minRe, double maxRe, double minIm, double maxIm, int width, int height) {

		// Skapar matris med width antal rader och height antal kolumner
		Complex[][] matris = new Complex[height][width];

		// Ger v�rden till alla platser i matrisen

		for (int i = 0; i < width; i++) {

			for (int k = 0; k < height; k++) {

				matris[k][i] = new Complex(minRe + i * ((maxRe - minRe) / width),
						maxIm - k * ((maxIm - minIm) / height));

			}
		}
		// Ger matrisens sista plats max v�rdet
		matris[height - 1][width - 1] = new Complex(maxRe, minIm);

		return matris;
	}

}
