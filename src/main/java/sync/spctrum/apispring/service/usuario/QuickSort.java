package sync.spctrum.apispring.service.usuario;

import sync.spctrum.apispring.domain.Usuario.Usuario;

import java.util.List;

public class QuickSort {

    public static void quickSort(List<Usuario> v, int indInicio, int indFim) {

        Usuario pivo = v.get(indFim);
        int i = indFim;

        for (int j = indFim - 1; j >= indInicio; j--) {

            if (v.get(j).getNome().compareToIgnoreCase(pivo.getNome()) > 0) {
                i--;

                troca(v, i, j);
            }
        }

        troca(v, indFim, i);

        if (indInicio < i) {
            quickSort(v, indInicio, i - 1);
        }
        if (i < indFim) {
            quickSort(v, i + 1, indFim);
        }
    }

    public static void troca(List<Usuario> v, int i, int j) {
        Usuario temp = v.get(i);
        v.set(i, v.get(j));
        v.set(j, temp);

    }
}
