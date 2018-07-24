package Chapter4_Task4;

class Exer4_Patient {
    private String id;
    private int age;
    private Exer4_BloodData bloodData;
    private String bType;
    private String rhFactor;

    Exer4_Patient()
        {
            bloodData = new Exer4_BloodData(bType, rhFactor);
        }
        String getId()
        {
            return id;
        }
        void setId()
        {
            this.id = id;
        }
        int getAge()
        {
            return age;
        }
        void setAge(int age)
        {
            this.age = age;
        }
        Exer4_BloodData getBloodData()
        {
            return bloodData;
        }
        void setBloodData(Exer4_BloodData b)
        {
            bloodData = b;
        }
    }