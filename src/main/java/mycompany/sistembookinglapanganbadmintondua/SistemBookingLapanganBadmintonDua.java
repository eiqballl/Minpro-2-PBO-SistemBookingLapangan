/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mycompany.sistembookinglapanganbadmintondua;
import controller.BookingController;
import view.BookingView;

/**
 *
 * @author Acer
 */
public class SistemBookingLapanganBadmintonDua {

    public static void main(String[] args) {
        BookingController controller = new BookingController();
        BookingView view = new BookingView(controller);

        view.menu();
    }
}
