import os
import pyttsx3
import speech_recognition as sr
class pythonhub:

    def takeCommands(self):
        r = sr.Recognizer()
        with sr.Microphone() as source:
            print('Listining')
            r.puase_threshold = 0.7
            audio = r.listen(source)

            try:
                print('Recognizing')
                Query = r.recognize_google(audio, language = 'en-in')

                print("The query is printed='",Query, "'")
            except Exception as e:
                print(e)
                print("Say that again sir")
                return "None"
        return Query
    
    def speak(self, audio):
        engine = pyttsx3.init('sapi5')

        voices = engine.getProperty('voices')
        engine.setProperty('voice', voices[1].id)
        engine.say(audio)
        engine.runAndWait()

    def quitSelf(self):
        self.speak("do u want to switch off the computer sir")

        take = self.takeCommands()
        choice = take
        if "yes" in choice:
            print("Shutting down the computer")
            self.speak("Shutting down the computer")
            os.system("shutdown /s /t 30")
        if "no" in choice:
            print("Thank you sir")
            self.speak("Thank you sir")

Maam = pythonhub()
Maam.quitSelf()