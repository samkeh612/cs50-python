x = int(input("What is x: "))
y = int(input("what is y: "))

#if and elif condition
if x < y: #if true prints 
    print(f"{x} is smaller than {y}")
    

elif x > y :
    print(f"{x} is greater than {y}")

elif x == y :
    print(f"{x} is equal to {y}")
    

elif x <= y :
    print(f"{x} is less or equal to {y}")
    

elif  x >= y :
    print(f"{x} id greater or equal to {y}")
    

#Or condition
if x<y or x>y :
    print(f"{x} is not equal to {y}")
    
else:
    print(f"{x} is equal to {y}")
    
if( x != y):
    print(f"{x} is not equal to {y}")
else:
    print(f"{x} is equal to {y}")
    

if(x==y):
    print(f"{x} is equal to {y}")
else:
    print(f"{x} is not equal to {y}")
    

#and condition

score = int(input("Score : "))

if(score >= 90 and score <= 100): 
    print(f"{score} Grade is A")
elif(score >= 80 and score<90):
    print(f"{score} Grade is B")
elif(score >= 70 and score<80):
    print(f"{score} Grade is C")
elif(score >=60 and score <70):
    print(f"{score} Grade is D")
elif(score >=50 and score <60):
    print(f"{score} Grade is E")
else:
    print(f"{score} Grade is F")
    

#modulas operation(returns remainder)

#checks if even or odd

if (x % 2 == 0): #even numbers are euqally divisible by 2, so is x%2 has remainder of zero, the 2 divides complitely which implies that x is even
    print(f"{x} is Even")
else:
    print(f"{x} is odd")
    
def main():
    t = int(input("What is t: "))
    if is_Even(t):
        print("Even")
    else:
        print("odd")
    
def is_Even(num):
    #num = num%2, return True if num else return False
    #return True id num % 2 == 0 else return false
    #return (num % 2 == 0)
    if num % 2 == 0:
        return True
    else:
        return False

main()

name = input("What is your name? ")

if(name == "Harry") :
    print(f"{name} is in the party")
elif (name == "Hermione"):
    print(f"{name} is in the party")
elif(name== "Ron"):
    print(f"{name} is in the party")
elif (name == "Draco"):
    print(f"{name} is in the party")
else:
    print(f"{name} is not in the party")
