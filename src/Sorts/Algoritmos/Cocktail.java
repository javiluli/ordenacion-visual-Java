package Sorts.Algoritmos;

import Adicionales.Delay;
import Interfaz.Sort;
import Principal.Main;
import Sorts.Sorts;

public class Cocktail extends Sorts implements Sort {

	public Cocktail(Main m) {
		this.m = m;
		sort();
	}

	@Override
	public void sort() {
		boolean cambiar = true;
		int inicio = 0;
		int fin = n.length;

		setInicio(System.currentTimeMillis());
		while (cambiar == true) {
			cambiar = false;
			for (int i = inicio; i < fin - 1; ++i) {
				accesoArray++;
				if (n[i] > n[i + 1]) {
					int temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
					cambiar = true;
					cambiosArray++;
				}
				m.textos();
				setFin(System.currentTimeMillis());
				Main.getPanelBarras().repaint();
				Delay.delay();
			}

			if (cambiar == false)
				break;

			cambiar = false;
			fin = fin - 1;

			for (int i = fin - 1; i >= inicio; i--) {
				accesoArray++;
				if (n[i] > n[i + 1]) {
					int temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
					cambiar = true;
					cambiosArray++;
				}
				m.textos();
				setFin(System.currentTimeMillis());
				Main.getPanelBarras().repaint();
				Delay.delay();
			}

			inicio = inicio + 1;
		}
	}

	@Override
	public String getNombre() {
		return "Cocktail Sort";
	}
}
