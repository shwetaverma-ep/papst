/**
 * PERMISSION IS HEREBY GRANTED, FREE OF CHARGE, TO ANY PERSON OBTAINING A COPY 
 * OF THIS SOFTWARE AND ASSOCIATED DOCUMENTATION FILES (THE "SOFTWARE"), TO USE
 * THE SOFTWARE WITHOUT RESTRICTION, INCLUDING WITHOUT LIMITATION THE RIGHTS TO
 * USE, COPY, MODIFY, MERGE, PUBLISH, DISTRIBUTE, AND/OR SELL COPIES OF THE 
 * SOFTWARE, AND TO PERMIT PERSONS TO WHOM THE SOFTWARE IS FURNISHED TO DO SO,
 * SUBJECT TO THE FOLLOWING LIMITATIONS OF LIABILITY AND SUCH LANGUAGE SHALL BE 
 * INCLUDED IN ALL COPIES OR REDISTRIBUTIONS OF ANY COMPLETE OR PORTION OF THIS 
 * SOFTWARE.
 * 
 * SOFTWARE IS BEING DEVELOPED IN PART AT THE NATIONAL INSTITUTE OF ARTHRITIS 
 * AND MUSCULOSKELTAL AND SKIN DISEASES (NIAMS), NATIONAL INSTITUTES OF HEALTH
 * (NIH) BY AN EMPLOYEE OF THE UNITED STATES GOVERNMENT IN THE COURSE OF THEIR 
 * OFFICIAL DUTIES. PURSUANT TO TITLE 17, SECTION 105 OF THE UNITED STATES CODE, 
 * THIS SOFTWARE IS NOT SUBJECT TO COPYRIGHT PROTECTION AND IS IN THE PUBLIC 
 * DOMAIN. EXCEPT AS CONTAINED IN THIS NOTICE, THE NAME OF THE AUTHORS, THE
 * NATIONAL INSTITUTE OF ARTHRITIS AND MUSCULOSKELTAL AND SKIN DISEASES, OR THE
 * NATIONAL INSTITUTES OF HEALTH  MAY NOT  BE USED TO ENDORSE OR PROMOTE PRODUCTS
 * DERIVED FROM THIS SOFTWARE WITHOUT SPECIFIC PRIOR WRITTEN PERMISSION FROM 
 * THE NIAMS OR THE NIH. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF 
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO WARRANTIES OF 
 * MERCHANTABILITY, FITNESS  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR UNITED STATES GOVERNMENT OR ANY AGENCY THEREOF BE 
 * LIABLE FOR ANY CLAIM, DAMAGES OR ANY OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE THEREOF.
 * 
 * Author: Paul W. Bible
 */
package papst.utility;

import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class JIconButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public JIconButton(String label,URL iconLocation){
		super();
		ImageIcon icon = new ImageIcon(iconLocation);
		
		JPanel wrapPanel = new JPanel();
		wrapPanel.setOpaque(false);
		
		this.setLayout(new BorderLayout());
		wrapPanel.setLayout(new BorderLayout());
		
		//this.setIcon(icon);
		this.add(new JLabel(icon),BorderLayout.NORTH);
		this.add(wrapPanel,BorderLayout.SOUTH);
		
		String[] stringParts = label.split("\\n");
		JLabel topLabel = new JLabel(stringParts[0]);
		topLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		wrapPanel.add(topLabel,BorderLayout.NORTH);
		
		if(stringParts.length > 1){
			JLabel botLabel = new JLabel(stringParts[1]);
			botLabel.setHorizontalAlignment(SwingConstants.CENTER);
			wrapPanel.add(botLabel,BorderLayout.SOUTH);
		}
	}
	
	

}
