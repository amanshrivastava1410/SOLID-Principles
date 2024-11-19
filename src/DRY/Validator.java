package DRY;

class Validator {
    public boolean isNotEmpty(String value, String fieldName) {
        if (value == null || value.isEmpty()) {
            System.out.println(fieldName + " is required.");
            return false;
        }
        return true;
    }
}
