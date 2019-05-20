public class IsMatchesPresent {

/**

    a[] = {23, 45, 2, 19, 67}
    b[] = {19, 23, 78, 86, 1}

    no_of_matches = 3
    O(n*m)

    a[] = {2,19,23,45,67}
    b[] = {1,19,23,78,86}


    boolean isMatchesPresent(int[] a, int[] b, matches){
        int counter =0;

        int[] c = new int[a.length+b.length];

        int i,j,k=0;
        while(k<a.length+b.length){
            if(a[i]==b[j]){
                c[k]=a[i];
                if(i<a.length){
                    i++; // check
                } else {
                    break;
                }
                if(j<b.length){
                    j++; // check
                }else {
                    break;
                }
                k++;
                counter++;
                continue;
            }
            if(a[i]<b[j]){
                c[k]=a[i];
                if(c[k]==b[j]){
                    counter++;
                }
                if(i<a.length){
                    i++; // check
                }else {
                    break;
                }
            } else{
                c[k]=b[j];
                if(c[k]==a[i]){
                    counter++;
                }
                if(j<b.length){
                    j++; // check
                }else {
                    break;
                }
            }
            k++;
        }
        return (counter==matches);

    }

======

    a[] = {23, 45, 2, 19, 67}
    b[] = {19, 23, 78, 86, 1}

    no_of_matches = 3
    O(n*m)

    a[] = {2,19,23,45,67}
    b[] = {1,19,23,78,86, 89, 99}

    a[] = {2,19,23,45,69}
    b[] = {1,19,23,45,55, 60,67, 69}


    boolean isMatchesPresent(int[] a, int[] b, matches){
        int counter =0;

        int[] c = new int[a.length+b.length];

        1,2,19

        int i,j,k=0;
        while(i<a.length || j<b.length){
            if(a[i]==b[j]){
                i++;j++;
                counter++;
            } else if(a[i]<b[i]){
                i++;
            } else {
                j++;
            }
        }
        return (counter==matches);

    }




**/
}
