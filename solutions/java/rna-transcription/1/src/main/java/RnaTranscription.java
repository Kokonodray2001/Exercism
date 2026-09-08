import java.util.HashMap;

class RnaTranscription {
    private static final HashMap<Character,Character>nucleotideComplimentMap = new HashMap<>();
    RnaTranscription(){
        nucleotideComplimentMap.put('C','G');
        nucleotideComplimentMap.put('G','C');
        nucleotideComplimentMap.put('T','A');
        nucleotideComplimentMap.put('A','U');
    }
    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for(Character strand : dnaStrand.toCharArray()) {
            rnaStrand.append(nucleotideComplimentMap.get(strand));
        }
        return rnaStrand.toString();
    }

}
