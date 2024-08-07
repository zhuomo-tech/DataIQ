package io.dataiq.entities.chat.enums;


/**
 * <p>
 * 在对话系统中，特别是像GPT-4这样的模型，通常有几个主要的角色，这些角色帮助模型理解和管理对话的结构和内容。以下是一些常见的对话角色：
 * <ul>
 *   <li><b>用户（User）</b>：这是对话的发起者和主要参与者之一。用户输入问题、提供信息或发出指令。模型的主要任务是理解用户的输入并生成适当的回复。</li>
 *   <li><b>助手（Assistant）</b>：这是对话系统本身的角色，也就是模型（例如GPT-4）。助手负责处理用户的输入并生成有用、相关的回复。</li>
 *   <li><b>系统（System）</b>：有时，系统角色可以代表对话管理的控制逻辑，例如管理对话的流程、处理上下文切换或者执行特定的对话策略。这种角色在更复杂的对话系统中可能更常见。</li>
 *   <li><b>第三方代理（Agent-Tool）</b>：在某些对话系统中，可能涉及与第三方服务或应用的交互。例如，与外部API、数据库或其他服务的交互。虽然这些不是真正的“对话角色”，但它们在对话系统的运作中扮演重要角色。</li>
 * </ul>
 * <p>
 *
 * @author xienng
 * @version 1.0
 * @date 2024年07月12日 10:06
 */
public enum ChatMessageRole {
    System,
    User,
    Assistant,
}
