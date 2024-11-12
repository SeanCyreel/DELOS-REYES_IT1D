print("Answer:Yes or No")
print("Question")
while True:    
    fever = input("Do you have a fever?").strip().lower()
    cough = input("Do you have cough?").strip().lower()
    breathing = input("Do you have difficulty in breathing?").strip().lower()        
    if (fever == "no" and cough == "no" and breathing == "no"):        
        print("You do not exhibit significant COVID-19 symptoms. Stay safe!")
    else:
        print("You may have COVID-19 symptoms. Please consult a healthcare professional.")   
    repeat = input("Do you want to check symptoms again? Yes or no: ").strip().lower()
    if (repeat != 'Yes'):
        print("Thank you for using the symptom checker. Stay safe!")
        break
      