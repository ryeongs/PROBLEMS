        String answer = "";
        ArrayList<String> strArrList = new ArrayList();
        for(Integer num : numbers){
            strNumbers.add(String.valueOf(num));
        }
        Collections.sort(strArrList, (a, b) -> (b + a).compareTo(a + b)); 
        if(strArrList.get(0).startsWith("0")) return "0";
        for(String s : strArrList){
            answer += s;
        }
        return answer;
