import java.util.Scanner;

public class FinanceAIChatbot {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FinanceAIChatbot chatbot = new FinanceAIChatbot();
        chatbot.startChat();
    }

    public void startChat() {
        String input;
        System.out.println("Hello! I am your personal finance assistant. How can I help you today?");
        
        do {
            System.out.print("You: ");
            input = scanner.nextLine();
            String response = processInput(input);
            System.out.println("Bot: " + response);
        } while (!input.equalsIgnoreCase("exit"));
    }

    private String processInput(String input) {
        if (input.toLowerCase().contains("budget")) {
            return "Let's set up your budget. What is your monthly income?";
        } else if (input.toLowerCase().contains("investment")) {
            return "Based on your risk profile, I recommend a mix of stocks and bonds.";
        } else if (input.toLowerCase().contains("advice")) {
            return "It's always a good idea to have an emergency fund. Have you set up one?";
        } else if (input.equalsIgnoreCase("exit")) {
            return "Goodbye! If you have any more questions, feel free to ask me anytime.";
        } else {
            return "I'm not sure how to help with that. Can you try asking something else?";
        }
    }
}

