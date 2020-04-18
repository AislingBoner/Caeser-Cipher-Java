public class CaesarCipher {
    private int key = 0;
    
    public CaesarCipher(int key){
        this.key = key;
    }
    
    public String encrypt(String plainText){
        String enc = "";
        for (int i = 0; i < plainText.length(); i++){
            char ch = (char)(plainText.codePointAt(i) + key);
            enc = enc + ch; //Inefficient
        }
        return enc;
    }
    
    public String decrypt(String cipherText){
        String dec = "";
        for (int i = 0; i < cipherText.length(); i++){
            char ch = (char)(cipherText.codePointAt(i) - key);
            dec = dec + ch; //Inefficient
        }
        return dec;
    }
    
    public static void main(String[] args){
        CaesarCipher cc = new CaesarCipher(7);
        String encrypted = cc.encrypt("Gauls are smelly and dangerous!");
        System.out.println(encrypted);
        System.out.println(cc.decrypt(encrypted));
        
    }    
}
