package Classes;

/**
 * Класс акционный клиент
 */
public class PromotionClient extends Actor {

    /**
     * ID промо клиента
     */

    private int idPromCl;
    /**
     * Максимальное количество акционных клиентов
     */

    public static int maxPromClients = 3;
    /**
     * Название акции
     */
    private String promotionName;

    /**
     * Конструктор акционного клиента
     *
     * @param name          Имя клиента
     * @param idPromCl
     * @param promotionName название акции
     */
    public PromotionClient(String name, int idPromCl, String promotionName) {
        super(name + " акционный ");
        this.idPromCl = idPromCl;
        this.promotionName = promotionName;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public boolean refundProduct() {
        return false;
    }

    public boolean checkProduct() {
        return false;
    }

    public boolean failureRefund() {
        return false;
    }

    public void refundMoney() {

    }

    public Actor getActor() {
        return this;
    }


}

