/*
        job of class-
            should give chances of getting tail and not getting tail.
 */

 class Chance {
    protected double value;

    public static Chance create(double value) throws InvalidProbabilityException {
        if(value<0 || value>1)
            throw new InvalidProbabilityException();
        return new Chance(value);
    }
    private Chance(double value) {
        this.value = value;
    }
     public Chance notOccuringEvent() throws InvalidProbabilityException {
         return create(1-this.value);
     }
     public Chance and(Chance otherChance) throws InvalidProbabilityException {
         return create(this.value * otherChance.value);
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         Chance chance = (Chance) o;
         return Double.compare(chance.value, value) == 0;
     }


 }