package OOPS.Interface.ComparableInterface;

class Word implements Comparable<Word> {
    String text;

    Word(String text) {
        this.text = text;
    }

    @Override
    public int compareTo(Word o) {
        return this.text.length() - o.text.length();
    }

    public String toString() {
        return text;
    }
}

