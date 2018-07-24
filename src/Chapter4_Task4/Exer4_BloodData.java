package Chapter4_Task4;

class Exer4_BloodData {

        private String bloodType;
        private String rhFactor;

        Exer4_BloodData()
        {
            this("O", "+");
        }
        Exer4_BloodData(String bType, String rh)
        {
            bloodType = bType;
            rhFactor = rh;
        }
        void setBloodType(String bType)
        {
            bloodType = bType;
        }
        String getBloodType()
        {
            return bloodType;
        }
        void setRhFactor(String rh)
        {
            rhFactor = rh;
        }
        String getRhFactor()
        {
            return rhFactor;
        }
    }